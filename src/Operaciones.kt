class Operaciones(var n1: Double, var n2: Double) {

    fun suma(): String {
        return "La Suma de $n1 + $n2: ${n1 + n2}"
    }

    fun division(): String {
        return if (n2 != 0.0) {
            "La División de $n1 / $n2: ${n1 / n2}"
        } else {
            "División por cero no permitida."
        }
    }

    fun potencia(): String {
        return "La potencia de $n1 a la $n2 es ${Math.pow(n1, n2)}"
    }

    fun raiz(): String {
        return if (n1 >= 0 && n2 != 0.0) {
            "La raíz $n2 de $n1 es ${Math.pow(n1, 1 / n2)}"
        } else {
            "Operación inválida para los valores proporcionados."
        }
    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }
}