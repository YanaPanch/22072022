package Task2;

import java.util.Comparator;

class EnvelopeComparator implements Comparator<Envelope> {

    @Override
    public int compare(Envelope first, Envelope second) {

        boolean first_AtoA_BtoB = ((first.getA() < second.getA()) && (first.getB() < second.getB()));
        boolean first_BtoA_BtoB = ((first.getA() < second.getB()) && (first.getB() < second.getA()));
        boolean second_AtoA_BtoB = ((second.getA() < first.getA()) && (second.getB() < first.getB()));
        boolean second_BtoA_BtoB = ((second.getA() < first.getB()) && (second.getB() < first.getA()));

        if (first_AtoA_BtoB || first_BtoA_BtoB)
            System.out.println("You can put first envelope into second");
        else if (second_AtoA_BtoB || second_BtoA_BtoB)
            System.out.println("You can put second envelope into first");
        else
            System.out.println("These envelopes are not compatible");
        return 0;
    }

}
