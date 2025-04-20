package unq.po2.tp5.collections;

import java.util.List;

public class ColeccionadorDeObjetos {

	public Object getFirstFrom(List<Object> aCollection) {
		
		return aCollection.get(0);
	}
	
	public void addLast(Object anElement, List<Object> aCollection) {
		
		aCollection.add(anElement);
	}

	public List<Object> getSubCollection(List<Object> aCollection, int from, int to) {
	
		return aCollection.subList(from, to);
}

	public Boolean containsElement(List<Object> aCollection, Object anElement) {
	
		return aCollection.contains(anElement);
}
}
