public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String assemblyCountry;

    Car (String brand, String model, double engineVolume, String color, int productionYear, String assemblyCountry) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (assemblyCountry == null || assemblyCountry.equals("")) {
            this.assemblyCountry = "default";
        } else {
            this.assemblyCountry = assemblyCountry;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                "; Модель: " + model +
                "; Год выпуска: " + productionYear +
                "; Объем двигателя " + engineVolume +
                " л.; Цвет: " + color +
                "; Страна сборки: " + assemblyCountry;
    }
}
