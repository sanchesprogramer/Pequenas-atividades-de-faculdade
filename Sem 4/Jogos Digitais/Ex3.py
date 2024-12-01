import random

class Tank(object):
    def __init__(self, name):
        self.name = name    #nome do tanque
        self.alive = True   #para saber se o tanque está vivo ou não
        self.ammo = 5       #para armazenar a munição do tanque
        self.armor = 60     #para armazenar a armadura do tanque

    def __str__(self):
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEADE)" % self.name

    def explode(self):
        self.alive = False
        print(self.name, "explodes!")
    
    def hit(self):
        self.armor -=20
        print(self.name, "is hit")
        if self.armor <= 0:
            self.explode()

    def fire_at(self, enemy):
        if self.ammo >=1: #verifica a qtde de balas
            self.ammo -=1 #subtrai uma bala ref a um tiro
            print(self.name, "fires on", enemy.name)
            enemy.hit()
        else:
            print(self.name, "has no shells!")

TankDict = {}
TargetList = []


PlayerCount = int(input("How many players (tanks) are playing? (Please choose a number between 2 and 10"))
while PlayerCount > 10 or PlayerCount < 2:
    print("Invalid choice, please input a correct option!")
    PlayerCount = int(input("How many players (tanks) are playing? (Please choose a number between 2 and 10)"))

def SetupGame(PlayerCount):
    for x in range(PlayerCount):
        TankName = input("Enter the name for player " + str(x+1))
        Player = Tank(TankName)
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
            print("It is now player " + str(PlayerTurn) + "'s turn")
            Turn(PlayerTurn)
        TurnOrder.remove(PlayerTurn)

def Turn(Player):
    Target = int(input("Please select a target to fire at excluding yourself! List of valid targets: " +str(TargetList)))
    while Target < 1 or Target > PlayerCount or Target == Player:
        print("Invalid target!")
        Target = int(input("Please select a target to fire at excluding yourself! List of valid targets: " +str(TargetList)))  
    TankDict[Player].fire_at(TankDict[Target])
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
    print(TankDict[x].name + "has won the game!")
