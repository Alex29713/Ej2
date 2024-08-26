//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Ejemplo 1: Clase Regular")

    val listaOperaciones: MutableList<String> = mutableListOf()

    val s = Operaciones(2.0, 3.0)
    listaOperaciones.add(s.suma())

    val d = Operaciones(2.0, 3.0)
    listaOperaciones.add(d.division())

    val r = Operaciones(2.0, 3.0)
    listaOperaciones.add(r.raiz())

    val p = Operaciones(2.0, 3.0)
    listaOperaciones.add(p.potencia())

    for (resultado in listaOperaciones) {
        println(resultado)
    }
    println("\n")
    println("Ejemplo 2: Data Class")

    val usuario1 = Usuario("Ana ","Pérez", "ana.perez@example.com", 28)
    val usuario2 = Usuario("Luis ","Gómez", "luis.gomez@example.com", 35)

    println("Apellido del usuario1: ${usuario1.correoElectronico} es ${usuario1.apellido}")
    println("Apellido del usuario2: ${usuario2.correoElectronico} es ${usuario2.apellido}")

    val usuario4 = usuario1.copy(edad = 29)
    println("usuario4 (copia de usuario1 con edad actualizada): $usuario4")
}