package com.mycompany.labwork3;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author ivahn
 */
public class Manager {
    private Storage storage = new Storage();

    public void importFile(File file) {

        Handler xmlHandler = new Handler(".xml", new XMLReader());
        Handler yamlHandler = new Handler(".yaml", new YAMLReader());
        Handler jsonHandler = new Handler(".json", new JSONReader());
        xmlHandler.setNext(yamlHandler);
        yamlHandler.setNext(jsonHandler);
        storage.setReactorTypes(xmlHandler.handle(file));
    }

    public ArrayList<ReactorType> getReactorTypes() {
        return storage.getReactorTypes();
    }
}
