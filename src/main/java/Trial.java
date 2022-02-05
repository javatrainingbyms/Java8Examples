

@FunctionalInterface
public interface Trial {
	void m1();
	default void m2() {}
	static void m3() {}
}
