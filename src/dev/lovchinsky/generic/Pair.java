package dev.lovchinsky.generic;

public final class Pair<F, S> {
    F first;
    S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }


    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object instanceof Pair) {
            Pair pair = (Pair) object;
            return (first != null ? first.equals(pair.getFirst()) : pair.getFirst() == null) &&
                    (second != null ? second.equals(pair.getSecond()) : pair.getSecond() == null);
        }

        return false;
    }

    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
    }
}
