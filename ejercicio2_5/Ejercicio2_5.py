class CuentaBancaria:
    def __init__(self, nombres, apellidos, numero_cuenta, tipo_cuenta):
        self.nombres = nombres
        self.apellidos = apellidos
        self.numero_cuenta = numero_cuenta
        self.tipo_cuenta = tipo_cuenta
        self.saldo = 0.0

    def mostrar_info(self):
        print(f"Titular: {self.nombres} {self.apellidos}")
        print(f"Número de cuenta: {self.numero_cuenta}")
        print(f"Tipo de cuenta: {self.tipo_cuenta}")
        print(f"Saldo: ${self.saldo:.2f}")

    def consultar_saldo(self):
        return self.saldo

    def consignar(self, valor):
        if valor > 0:
            self.saldo += valor
            print(f"Consignación exitosa de ${valor:.2f}. Nuevo saldo: ${self.saldo:.2f}")
        else:
            print("El valor a consignar debe ser positivo.")

    def retirar(self, valor):
        if valor <= self.saldo:
            self.saldo -= valor
            print(f"Retiro exitoso de ${valor:.2f}. Nuevo saldo: ${self.saldo:.2f}")
        else:
            print("Fondos insuficientes. No se puede realizar el retiro.")


if __name__ == "__main__":
    cuenta = CuentaBancaria("Tomás", "Echeverri", "123456", "Ahorros")
    cuenta.mostrar_info()
    cuenta.consignar(500000)
    cuenta.retirar(200000)
    cuenta.consultar_saldo()
    cuenta.retirar(400000)

