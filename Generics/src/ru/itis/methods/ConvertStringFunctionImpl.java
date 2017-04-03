package ru.itis.methods;

public class ConvertStringFunctionImpl implements ConvertFunction<String> {

    @Override
    public String convert(String source) {
        return source.toUpperCase();
    }
}
