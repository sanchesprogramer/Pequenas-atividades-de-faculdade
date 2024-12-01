import random

class Tank(object):
    def __init__(self, name, type):
        self.name = name    #nome do tanque
        self.alive = True   #para saber se o tanque está vivo ou não
        self.ammo = 5       #para armazenar a munição do tanque
        if type == 1:
            #Heavy
            self.armor = 80     
            self.damage = 10
            self.type = type
        elif type == 2:
            #Light
            self.armor = 50    
            self.damage = 30
            self.type = type
        elif type == 3:
            #Gambler
            self.armor = 45
            self.damage = 20
            self.type = type           

    def __str__(self):
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEAD)" % self.name

    def explode(self):
        self.alive = False
        print(self.name, "explodes!")
    
    def hit(Shooter, self):
        CritChance = random.randint(1,20)
        if CritChance == 1:
            self.armor -= (Shooter.damage*2)
            print("Critical hit!")
        elif Shooter.type == 3 and CritChance <= 2:
            self.armor -= (Shooter.damage*2)
            print("Critical hit!")
        else:
            self.armor -= Shooter.damage
            print(self.name, "is hit!")
        if self.armor <= 0:
            self.explode()

    def fire_at(self, Target):
        print(self.name, "fires on", Target.name)
        ShotChance = random.randint(1,10)
        if ShotChance <= 2:
            print("Your shot has missed!")
        elif ShotChance <= 4 and Target.type == 3:
            print("Your shot has missed!")
        else: 
            if self.ammo >=1: #verifica a qtde de balas
                self.ammo -=1 #subtrai uma bala ref a um tiro
                self.hit(Target)
            else:
                print(self.name, "has no shells!")

TankDict = {}
TargetList = []


PlayerCount = int(input("How many players (tanks) are playing? (Please choose a number between 2 and 10)"))
while PlayerCount > 10 or PlayerCount < 2:
    print("Invalid choice, please input a correct option!")
    PlayerCount = int(input("How many players (tanks) are playing? (Please choose a number between 2 and 10)"))

def SetupGame(PlayerCount):
    for x in range(PlayerCount):
        TankName = input("Enter the name for player  " + str(x+1))
        print("Tank Classes: \n 1 - Heavy (+20 armor, -10 damage) \n 2 - Light (+20 damage, -10 armor) \n 3 - Gambler (-15 armor, double crit and dodge chance)")
        TankClass = int(input("Choose your class:"))
        Player = Tank(TankName, TankClass)
        TankDict.update({(x+1): Player})
def ResetTurn():
    TurnOrder = []
    for x in range(len(TargetList)):
        TurnOrder.append(x+1)
    return TurnOrder

def StartingTurn():
    TurnOrder = []
    for x in range(len(TankDict.keys())):
        TurnOrder.append(x+1)
    return TurnOrder


def SetTurn(TurnOrder):
    while len(TurnOrder) > 0:
        PlayerTurn = random.choice(TurnOrder)
        if PlayerTurn in TargetList:
            print("It is now player " + str(TankDict[PlayerTurn].name) + "'s turn")
            Turn(PlayerTurn)
        TurnOrder.remove(PlayerTurn)

def Turn(Player):
    TargetList.remove(Player)
    Target = int(input("Please select a target to fire at excluding yourself! List of valid targets: " +str(TargetList)))
    while Target < 1 or Target > PlayerCount or Target == Player:
        print("Invalid target!")
        Target = int(input("Please select a target to fire at excluding yourself! List of valid targets: " +str(TargetList)))  
    TankDict[Player].fire_at(TankDict[Target])
    TargetList.append(Player)
    TargetList.sort()
    print(str(TankDict[Target]))
    if TankDict[Target].alive == False:
        TargetList.remove(Target)
        TankDict.pop(Target)
        print("Player " +str(Target) + " has been eliminated!")


SetupGame(PlayerCount)
TargetList = StartingTurn()
while len(TankDict) > 1:
    TurnOrder = ResetTurn()
    SetTurn(TurnOrder)
for x in TankDict:
    print(TankDict[x].name + " has won the game!")
