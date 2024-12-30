package a1_ProcessingInMemoryData;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Sale> sales = new ArrayList<Sale>(); // this is the list of all the sales

		sales.add(new Sale("Headphone", LocalDate.of(2024, 3, 18), 2_000));
		sales.add(new Sale("Mobile", LocalDate.of(2024, 3, 18), 9_000));
		sales.add(new Sale("charger", LocalDate.of(2024, 4, 18), 100));

		int amountSoldInMarch = 0;
		for (Sale sale : sales) {
			if (sale.getDate().getMonth() == Month.MARCH) {
				amountSoldInMarch += sale.getAmount();
			}
		}
		System.out.println("Amount sold in March: " + amountSoldInMarch);

		// help of the stream

		long salesAmountCount = sales.stream().filter(sale -> sale.getDate().getMonth() == Month.MARCH)
				.mapToInt(sale -> sale.getAmount()).sum();
		System.out.println("Amount sold in March: " + salesAmountCount);

		// stream steps:
		Stream<Sale> saleStream = sales.stream();
		Stream<Sale> marchSales = saleStream.filter(sale -> sale.getDate().getMonth().equals(Month.MARCH));
		LongStream salesAmount = marchSales.mapToLong(sale -> sale.getAmount());
		long totalAmount = salesAmount.sum();
		System.out.println("Amount sold in March: " + totalAmount);

		/*
		 * select sum(amount) from Sales where extract(month from date) = 3;
		 * 
		 */

		// ---------------------------------------------

		// generate list for 1-99_999

		List<Long> longNumList = LongStream.range(1, 99_999).boxed().toList();// boxed convert long->Long, int-> Integer
		// longNumList.forEach(System.out::println);

		long min = longNumList.stream().min((a, b) -> Integer.MIN_VALUE).get();
		// long min2 = longNumList.stream().min(Integer::min);
		long min3 = Collections.min(longNumList);

		long max = longNumList.stream().max((a, b) -> Integer.MAX_VALUE).get();

		OptionalDouble avg = longNumList.stream().mapToLong(Long::longValue).average();

		LongSummaryStatistics summ = longNumList.stream().mapToLong(Long::longValue).summaryStatistics();

		System.out.println("min: " + min);
		System.out.println("min3: " + min3);
		System.out.println("max: " + max);
		System.out.println("avg: " + avg);
		System.out.println("summ: " + summ);

	}
}
