package p2;

public enum Side
{
    BUY((short)1),

    SELL((short)2);

    private final short value;

    Side(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static Side get(final short value)
    {
        switch (value)
        {
            case 1: return BUY;
            case 2: return SELL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
