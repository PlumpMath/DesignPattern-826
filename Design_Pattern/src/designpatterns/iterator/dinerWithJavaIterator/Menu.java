package designpatterns.iterator.dinerWithJavaIterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
