/**
 * Clase que representa un rectángulo con su base y altura.
 *
 * @property base La longitud de la base del rectángulo.
 * @property altura La altura del rectángulo.
 */
class Rectangulo(base: Double, altura: Double) {
    private var base: Double = 0.0
    private var altura: Double = 0.0

    /**
     * Constructor primario que inicializa la base y la altura del rectángulo.
     *
     * @param base La longitud de la base del rectángulo.
     * @param altura La altura del rectángulo.
     */
    init {
        this.base = base
        this.altura = altura
    }

    /**
     * Calcula el área del rectángulo.
     *
     * @return El área del rectángulo como una cadena de texto con dos decimales.
     */
    private fun area(): String {
        return "%.2f".format(base * altura)
    }

    /**
     * Calcula el perímetro del rectángulo.
     *
     * @return El perímetro del rectángulo como una cadena de texto con dos decimales.
     */
    private fun perimetro(): String {
        return "%.2f".format((2 * base) + (2 * altura))
    }

    /**
     * Devuelve una representación de cadena del rectángulo incluyendo su base, altura, área y perímetro.
     *
     * @return Representación de cadena del rectángulo.
     */
    override fun toString(): String {
        return "El rectángulo de base $base y de altura $altura tiene un área de ${area()} y un perímetro de ${perimetro()}"
    }
}