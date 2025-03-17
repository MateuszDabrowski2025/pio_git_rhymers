package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	// 4.1 poprawa nazw klas
	// 4.2 zmiana konwencji nazewniczej metod

	int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
	    if (!callCheck() && in > peekaboo())
	            totalRejected++;
		else
	            super.countIn(in);
    }
}
