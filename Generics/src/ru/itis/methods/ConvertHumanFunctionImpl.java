package ru.itis.methods;


import ru.itis.compare.Human;

public class ConvertHumanFunctionImpl implements ConvertFunction<Human> {
    @Override
    public Human convert(Human source) {
        return new Human(source.getName(), source.getAge(), source.getHeight() * 2);
    }
}
