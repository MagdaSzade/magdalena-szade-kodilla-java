package com.kodilla.patterns.builder.bigmac;


import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final List<String> ingredients;

    private Bigmac(String bun, int burgers, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();
        private AvailableOptions options = new AvailableOptions();

        public BigmacBuilder bun(String bun) {
            if (options.getAvailableBuns().contains(bun))
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers <= 3) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("Niedozwolona ilość kotletów.");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (options.getAvailableIngredients().contains(ingredient)) {
                this.ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Niedozwolony składnik.");
            }
        }

        public Bigmac build() {
            if (this.bun != null) {
                return new Bigmac(this.bun, this.burgers, this.ingredients);
            } else {
                throw new IllegalStateException("Nie wybrałeś bułki, bez niej się nie da zrobić hamburgera.");
            }
        }
    }

    public String getBun() {
        return this.bun;
    }

    public int getBurgers() {
        return this.burgers;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "Bułka='" + bun + '\'' +
                ", ilość kotletów='" + burgers + '\'' +
                ", składniki dodatkowe=" + ingredients +
                '}';
    }
}
