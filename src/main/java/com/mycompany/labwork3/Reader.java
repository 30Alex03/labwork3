package com.mycompany.labwork3;

import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author ivahn
 */
public interface Reader {
    ArrayList<ReactorType> read(File file);
}
