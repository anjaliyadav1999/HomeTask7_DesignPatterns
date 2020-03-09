package com.DesignPattern;

public class BuilderPattern {
    static class Tea {
        private Tea(Builder builder) {
            this.type = builder.type;
            this.sugar = builder.sugar;
            this.milk = builder.milk;
            this.size = builder.size;
        }
        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;
        public static class Builder {
            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;
            public Builder(String type) {
                this.type = type;
            }
            public Builder sugar(boolean value) {
                this.sugar = value;
                return this;
            }
            public Builder milk(boolean value) {
                this.milk = value;
                return this;
            }
            public Builder size(String value) {
                this.size = value;
                return this;
            }
            public Tea build() {
                return new Tea(this);
            }
        }
        @Override
        public String toString() {
            return String.format("Coffee [type=%s, sugar=%s, milk=%s, size=%s]", this.type, sugar, milk, size);
        }
    }
    public static void main(String[] args) {
        Tea tea = new BuilderPattern.Tea.Builder("Mocha").milk(true).sugar(false).size("Large").build();
        System.out.println(tea);
    }
}
