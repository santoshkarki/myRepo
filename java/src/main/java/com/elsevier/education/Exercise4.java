package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		//private int count = 0;
		private AtomicInteger count = new AtomicInteger(0);
		
		public Counter(AtomicInteger count) {
		    this.count = count;
		}
		public void increment() {
			//return ++count;
			count.incrementAndGet();
			
		}
		
		public AtomicInteger getCount() {
			return count;
			
		}
		
		public synchronized void resetCount() {
			count.set(0);
		}

	}
}