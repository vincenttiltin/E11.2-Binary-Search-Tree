import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeSetTest {

	@Test
	public void testAdd1() {
		TreeSet<Integer> tree = new TreeSet<>();

		assertTrue(tree.add(2));
		assertFalse(tree.add(2));

		assertEquals(2, tree.root.element);
	}

	@Test
	public void testAdd2() {
		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(2);
		tree.add(1);
		tree.add(3);

		assertEquals(2, tree.root.element);
		assertEquals(1, tree.root.left.element);
		assertEquals(3, tree.root.right.element);
	}

	@Test
	public void testAdd3() {
		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(5);
		tree.add(2);
		tree.add(1);
		tree.add(3);

		assertEquals(5, tree.root.element);
		assertEquals(2, tree.root.left.element);
		assertEquals(1, tree.root.left.left.element);
		assertEquals(3, tree.root.left.right.element);
	}

	@Test
	public void testAdd4() {
		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(5);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		tree.add(7);
		tree.add(6);
		tree.add(8);

		assertEquals(5, tree.root.element);
		assertEquals(2, tree.root.left.element);
		assertEquals(1, tree.root.left.left.element);
		assertEquals(3, tree.root.left.right.element);
		assertEquals(7, tree.root.right.element);
		assertEquals(6, tree.root.right.left.element);
		assertEquals(8, tree.root.right.right.element);
	}

	@Test
	public void testContains0() {
		TreeSet<Integer> tree = new TreeSet<>();

		assertFalse(tree.contains(1));
	}

	@Test
	public void testContains1() {
		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(2);

		assertTrue(tree.contains(2));
		assertFalse(tree.contains(1));
	}

	@Test
	public void testContains2() {
		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(5);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		tree.add(7);
		tree.add(6);
		tree.add(8);

		assertTrue(tree.contains(5));
		assertTrue(tree.contains(2));
		assertTrue(tree.contains(1));
		assertTrue(tree.contains(3));
		assertTrue(tree.contains(7));
		assertTrue(tree.contains(6));
		assertTrue(tree.contains(8));

		assertFalse(tree.contains(4));
		assertFalse(tree.contains(9));
		assertFalse(tree.contains(100));
	}
}
