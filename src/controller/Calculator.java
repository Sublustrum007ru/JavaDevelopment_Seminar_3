package controller;

public class Calculator {

    public static <T extends Number> T sum(T x, T y) {
        if (getType(x).equals("Integer")) {
            if (getType(y).equals("Double")) {
                return (T) Double.valueOf(x.intValue() + y.doubleValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf(x.intValue() + y.floatValue());
            }
            return (T) Integer.valueOf(x.intValue() + y.intValue());
        } else if (getType(x).equals("Double")) {
            if (getType(y).equals("Integer")) {
                return (T) Double.valueOf(x.doubleValue() + y.intValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf((float) (x.doubleValue() + y.floatValue()));
            }
            return (T) Double.valueOf(x.doubleValue() + y.doubleValue());
        } else if (getType(x).equals("Float")) {
            if (getType(y).equals("Integer")) {
                return (T) Float.valueOf(x.floatValue() + y.intValue());
            } else if (getType(y).equals("Double")) {
                return (T) Float.valueOf((float) (x.floatValue() + y.doubleValue()));
            }
            return (T) Float.valueOf(x.floatValue() + y.floatValue());
        } else {
            throw new IllegalArgumentException("Не верный тип числа");
        }
    }


    public static <T extends Number> T multiply(T x, T y) {
        if (getType(x).equals("Integer")) {
            if (getType(y).equals("Double")) {
                return (T) Double.valueOf(x.intValue() * y.doubleValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf(x.intValue() * y.floatValue());
            }
            return (T) Integer.valueOf(x.intValue() * y.intValue());
        } else if (getType(x).equals("Double")) {
            if (getType(y).equals("Integer")) {
                return (T) Double.valueOf(x.doubleValue() * y.intValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf((float) (x.doubleValue() * y.floatValue()));
            }
            return (T) Double.valueOf(x.doubleValue() * y.doubleValue());
        } else if (getType(x).equals("Float")) {
            if (getType(y).equals("Integer")) {
                return (T) Float.valueOf(x.floatValue() * y.intValue());
            } else if (getType(y).equals("Double")) {
                return (T) Float.valueOf((float) (x.floatValue() * y.doubleValue()));
            }
            return (T) Float.valueOf(x.floatValue() * y.floatValue());
        } else {
            throw new IllegalArgumentException("Не верный тип числа");
        }
    }

    public static <T extends Number> T divide(T x, T y) {
        if (getType(x).equals("Integer")) {
            if (getType(y).equals("Double")) {
                return (T) Double.valueOf(x.intValue() / y.doubleValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf(x.intValue() / y.floatValue());
            }
            return (T) Integer.valueOf(x.intValue() / y.intValue());
        } else if (getType(x).equals("Double")) {
            if (getType(y).equals("Integer")) {
                return (T) Double.valueOf(x.doubleValue() / y.intValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf((float) (x.doubleValue() / y.floatValue()));
            }
            return (T) Double.valueOf(x.doubleValue() / y.doubleValue());
        } else if (getType(x).equals("Float")) {
            if (getType(y).equals("Integer")) {
                return (T) Float.valueOf(x.floatValue() / y.intValue());
            } else if (getType(y).equals("Double")) {
                return (T) Float.valueOf((float) (x.floatValue() / y.doubleValue()));
            }
            return (T) Float.valueOf(x.floatValue() / y.floatValue());
        } else {
            throw new IllegalArgumentException("Не верный тип числа");
        }
    }

    public static <T extends Number> T subtract(T x, T y) {
        if (getType(x).equals("Integer")) {
            if (getType(y).equals("Double")) {
                return (T) Double.valueOf(x.intValue() - y.doubleValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf(x.intValue() - y.floatValue());
            }
            return (T) Integer.valueOf(x.intValue() - y.intValue());
        } else if (getType(x).equals("Double")) {
            if (getType(y).equals("Integer")) {
                return (T) Double.valueOf(x.doubleValue() - y.intValue());
            } else if (getType(y).equals("Float")) {
                return (T) Float.valueOf((float) (x.doubleValue() - y.floatValue()));
            }
            return (T) Double.valueOf(x.doubleValue() - y.doubleValue());
        } else if (getType(x).equals("Float")) {
            if (getType(y).equals("Integer")) {
                return (T) Float.valueOf(x.floatValue() - y.intValue());
            } else if (getType(y).equals("Double")) {
                return (T) Float.valueOf((float) (x.floatValue() - y.doubleValue()));
            }
            return (T) Float.valueOf(x.floatValue() - y.floatValue());
        } else {
            throw new IllegalArgumentException("Не верный тип числа");
        }
    }

    private static <T extends Number> String getType(T el) {
        if (el.getClass().getSimpleName().equals("Integer")) {
            return "Integer";
        } else if (el.getClass().getSimpleName().equals("Double")) {
            return "Double";
        } else if (el.getClass().getSimpleName().equals("Float")) {
            return "Float";
        } else if (el.getClass().getSimpleName().equals("Long")) {
            return "Long";
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }
}
