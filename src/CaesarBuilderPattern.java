
public class CaesarBuilderPattern {
    static class Caesar {
        private Caesar(Builder builder) {
            this.type = builder.type;
            this.sauce = builder.sauce;
            this.lettuce = builder.lettuce;
            this.chicken = builder.chicken;
            this.shrimp = builder.shrimp;
            this.parmesan = builder.parmesan;
            this.croutons = builder.croutons;
            this.size = builder.size;
        }

        private String type;
        private boolean sauce;
        private boolean lettuce;
        private boolean chicken;
        private boolean shrimp;
        private boolean parmesan;
        private boolean croutons;
        private String size;

        public static class Builder {
            private String type;
            private boolean sauce;
            private boolean lettuce;
            private boolean chicken;
            private boolean shrimp;
            private boolean parmesan;
            private boolean croutons;
            private String size;

            public Builder(String type) {
                this.type = type;
            }

            public Builder sauce(boolean value) {
                this.sauce = value;
                return this;
            }

            public Builder lettuce(boolean value) {
                this.lettuce = value;
                return this;
            }

            public Builder chicken(boolean value) {
                this.chicken = value;
                return this;
            }

            public Builder shrimp(boolean value) {
                this.shrimp = value;
                return this;
            }

            public Builder parmesan(boolean value) {
                this.parmesan = value;
                return this;
            }

            public Builder croutons(boolean value) {
                this.croutons = value;
                return this;
            }

            public Builder size(String value) {
                this.size = value;
                return this;
            }

            public Caesar build() {
                return new Caesar(this);
            }
        }

        @Override
        public String toString() {
            return String.format("[type=%s, sauce=%s, lettuce=%s, chicken=%s, shrimp=%s, parmesan=%s, croutons=%s, size=%s]", this.type, sauce, lettuce, chicken, shrimp, parmesan, croutons, size);
        }

    }
}
