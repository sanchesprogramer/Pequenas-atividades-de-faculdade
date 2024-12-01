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

Tank1 = Tank("Sherman")
Tank2 = Tank("Panzer")
Tank3 = Tank("Light")
Tank4 = Tank("Cromwell")
Tank5 = Tank("T-28")

Tanks = []
Tanks.append(Tank1)
Tanks.append(Tank2)
Tanks.append(Tank3)
Tanks.append(Tank4)
Tanks.append(Tank5)


x = random.randint(0, (len(Tanks)-1))
print(x)

while(len(Tanks) > 1):
    x = random.randint(0, (len(Tanks)-1))
    y = random.randint(0, (len(Tanks)-1))
    while y == x:
        y = random.randint(0, (len(Tanks)-1))
    Shooter = Tanks[x]
    Target = Tanks[y]
    Shooter.fire_at(Target)
    if(Target.alive == False):
        Tanks.pop(y)
        print(Target.name + " has exploded!")


print(Tanks[0].name + " wins!")