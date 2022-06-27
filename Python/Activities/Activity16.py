class Car:
    'This class represents a car'
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
         print(self.manufacturer+" "+self.model+ "  has started moving")

    def stop(self):
         print(self.manufacturer+" "+self.model+ "  has stopped moving")    


car1 = Car("Hyundai","i20","2015","Manual","White")
car2 = Car("Toyota","Inova","2015","Manual","Grey")
car3 = Car("Suzuki","Swift","2020","Auto","White")

car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()