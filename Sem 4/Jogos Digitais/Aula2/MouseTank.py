import pygame
from pygame.locals import *
from sys import exit

pygame.init()
SCREEN_SIZE =(800,600)
screen = pygame.display.set_mode(SCREEN_SIZE, 0 ,32)

tank = pygame.image.load('tanque.jpg').convert()

x,y=0,0
move_x, move_y = 0,0

while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            exit()
        if event.type == pygame.MOUSEBUTTONDOWN:
           x,y = pygame.mouse.get_pos()
        x += move_x
        y += move_y

        screen.fill((255,255,255))
        screen.blit(tank,(x,y))

        pygame.display.update()