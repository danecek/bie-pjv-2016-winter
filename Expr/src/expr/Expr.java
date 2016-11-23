package expr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public interface Expr extends Serializable {

    int eval();

    int priority();

    default void store(String file) throws Exception {
        if (new File(file).exists()) {
            throw new Exception("the file already exists");
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        }
    }
    
    static Expr load(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        return (Expr) ois.readObject();
    }

}
