package com.pb.titova.hw7;

public enum Size {
    XXS(36) {
        @Override
        public String getDescription() {
            return "children's size";
        }
    },
    XS(38),
    S(40),
    M(42),
    L(44);
    Size(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "adult`s size";
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private int EuroSize;
}
