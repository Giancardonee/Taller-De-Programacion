programa nomrePrograma
areas
  ciudad: AreaC(1,1,100,100)
robots
  robot  tipo1  
  comenzar
    repetir 2
      mover
    derecha
    repetir 3
      mover
    Informar(PosCa,PosAv)
  fin
variables
  robot1: tipo1
comenzar
  AsignarArea(robot1,ciudad)
  Iniciar(robot1,1,1)  
fin