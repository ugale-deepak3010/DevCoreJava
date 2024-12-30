package a1_ProcessingInMemoryData;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class LoadTesting {

	public static void main(String[] args) {

		Instant starTime = Instant.now();

		LongStream.range(1, 1_000_000).forEach(System.out::println);

		Instant endTime = Instant.now();

		Duration totalTime = Duration.between(starTime, endTime);

		System.err.println("Total Time" + totalTime.toMillis());

	}

}
