package net.haloz.corporation.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Random;

@RequiredArgsConstructor
public enum Department {
    DEPARTMENT_1(1), DEPARTMENT_2(2), DEPARTMENT_3(3), DEPARTMENT_4(4), DEPARTMENT_5(5);
    @Getter
    private final int id;
    public static Department getDepartment(int id) {
        return Arrays.stream(Department.values())
                .filter(e -> e.id == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cannot find department"));
    }
    private static final Random RNDM = new Random();
    public static Department randomDepartment()  {
        Department[] directions = values();
        return directions[RNDM.nextInt(directions.length)];
    }
    public static double randomSalary(){
        return RNDM.nextInt(50000, 200000);
    }
}
