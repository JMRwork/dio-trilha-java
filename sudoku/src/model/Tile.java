package model;

public class Tile {
	private Integer actual;
	private final int expected;
	private final boolean fixed;
	
	public Tile(int expected, boolean fixed) {
		if (fixed) {
			this.actual = expected;
		} else {
			this.actual = null;
		}

		this.expected = expected;
		this.fixed = fixed;
	}

	public Integer getActual() {
		return actual;
	}

	public void setActual(Integer actual) {
		if (fixed) return;
		this.actual = actual;
	}

	public int getExpected() {
		return expected;
	}

	public boolean isFixed() {
		return fixed;
	}
	
}
