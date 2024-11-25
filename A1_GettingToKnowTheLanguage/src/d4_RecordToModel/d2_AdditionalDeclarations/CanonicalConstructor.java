package d4_RecordToModel.d2_AdditionalDeclarations;

public record CanonicalConstructor(int min, int max) {

	// refer State Record
	public CanonicalConstructor(int min, int max) {
		this.max = min;
		this.min = max;
		if (min > max) {
			throw new IllegalArgumentException("Min can't large than min value");
		}
	}

}
