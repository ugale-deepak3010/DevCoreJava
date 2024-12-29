package a1_CollectionFramwork.A3_ImplementIterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {

	private final int start;
	private final int end;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Iterator<Integer> iterator() {

		return new Iterator<>() {
			private int index = start;

			@Override
			public boolean hasNext() {
				return index < end;
			}

			@Override
			public Integer next() {

				if (index > end) {
					throw new NoSuchElementException("" + index);
				}

				int currentIndex = index;
				index++;
				return currentIndex;
			}
		};
	}

}
