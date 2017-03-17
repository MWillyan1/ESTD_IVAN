package bovespa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Stock {

	private String codigo;

	private LocalDate data;

	private BigDecimal openPrice;

	private BigDecimal closePrice;

	private BigDecimal priceMin;

	private BigDecimal priceMax;

	public String getCodigo() { 
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}

	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

	public BigDecimal getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(BigDecimal priceMin) {
		this.priceMin = priceMin;
	}

	public BigDecimal getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(BigDecimal priceMax) {
		this.priceMax = priceMax;
	}

}
