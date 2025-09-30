
import math

class Circulo:
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * (self.radio ** 2)

    def perimetro(self):
        return 2 * math.pi * self.radio

    def mostrar(self):
        print(f"Círculo: radio={self.radio}, área={self.area():.2f}, perímetro={self.perimetro():.2f}")


class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura

    def perimetro(self):
        return 2 * (self.base + self.altura)

    def mostrar(self):
        print \
            (f"Rectángulo: base={self.base}, altura={self.altura}, área={self.area():.2f}, perímetro={self.perimetro():.2f}")


class Cuadrado(Rectangulo):
    def __init__(self, lado):
        super().__init__(lado, lado)

    def mostrar(self):
        print(f"Cuadrado: lado={self.base}, área={self.area():.2f}, perímetro={self.perimetro():.2f}")


class TrianguloRectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return (self.base * self.altura) / 2

    def perimetro(self):
        return self.base + self.altura + self.hipotenusa()

    def hipotenusa(self):
        return math.sqrt(self.base ** 2 + self.altura ** 2)

    def tipo_triangulo(self):
        hip = self.hipotenusa()
        if self.base == self.altura == hip:
            return "Equilátero"
        elif self.base == self.altura or self.base == hip or self.altura == hip:
            return "Isósceles"
        else:
            return "Escaleno"

    def mostrar(self):
        print \
            (f"Triángulo Rectángulo: base={self.base}, altura={self.altura}, área={self.area():.2f}, perímetro={self.perimetro():.2f}, hipotenusa={self.hipotenusa():.2f}, tipo={self.tipo_triangulo()}")


if __name__ == "__main__":
    c = Circulo(5)
    r = Rectangulo(4, 6)
    q = Cuadrado(4)
    t = TrianguloRectangulo(3, 4)

    c.mostrar()
    r.mostrar()
    q.mostrar()
    t.mostrar()
