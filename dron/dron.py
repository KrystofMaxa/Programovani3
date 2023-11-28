from djitellopy import Tello

tello = Tello()

tello.connect()
tello.takeoff()

tello.up(100)


tello.move_forward() # 1 metr
tello.left()

tello.move_forward()
tello.rotate_clockwise(45)

tello.move_forward() # 3 metry
tello.rotate_clockwise(315)

tello.move_forward()
tello.left()

tello.move_forward()
tello.left()

tello.move_forward()
tello.rotate_clockwise(45)

tello.move_forward()
tello.rotate_clockwise(22.5)

tello.move_forward() # 3 metry
tello.rotate_clockwise(137.5)

tello.move_forward()        

tello.land()        