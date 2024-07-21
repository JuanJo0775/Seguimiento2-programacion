package Ejercicio19;

import java.util.Arrays;

public class Cars {
    private int[] defectiveModels = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};

    int modelNumber;

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isDefectiveModel(int modelNumber) {
        for (int model : defectiveModels) {
            if (model == getModelNumber()) {
                return true;
            }
        }
        return false;
    }


    public void checkCarModel() {
        if (isDefectiveModel(modelNumber)) {
            System.out.println("The car is defective, take it under warranty.");
        } else {
            System.out.println("Your car is not defective.");
        }
    }

    @Override
    public String toString() {
        return "Cars{" +
                "defectiveModels=" + Arrays.toString(defectiveModels) +
                ", modelNumber=" + modelNumber +
                '}';
    }
}