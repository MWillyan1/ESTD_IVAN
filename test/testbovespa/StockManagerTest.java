package testbovespa;

import java.io.IOException;

import org.junit.Test;

import bovespa.StockManager;

public class StockManagerTest {

		@Test
		public void loadStocksTEst() throws IOException{
			StockManager stockManager = new StockManager();
			stockManager.loadStocks("Z:/ESTD_COTA/COTAHIST_A2016_TEST.txt");
		}
}
