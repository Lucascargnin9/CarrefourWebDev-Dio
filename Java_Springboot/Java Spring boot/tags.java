import java.math.BigDecimal;


/**
 * @author Lucas
 * @version 1.0.0
 * @see BigDecimal
 * @since 1.0.0
 * 
 */
public class tags {

    private final String code;
    private final BigDecimal totalValue;

    /**
     * 
     * @param code  codigo do pedido
     * @param totalValue valor total do pedido
     */

    public tags(String code, BigDecimal totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * calcula valor total de acordo com o valor do pedido. Se valor maior que 100 uma taxa será cobrada
     * @return valor total do pedido com taxas
     * @throws RuntimeException se o valor do pedido for negativo
     */

    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum()<0) {
            throw new RuntimeException("O Pedido nao pode ter valor negativo");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00"))>0) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }
}
