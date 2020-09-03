import java.util.ArrayList;

/**
 * This class represents a reference object which can be found in CVE object
 *
 * Its purpose is to create reference objects which are then put into CVE objects
 *
 * @author Tomas Bozek (XarfNao)
 */
public class ReferenceObject {

    protected String url;
    protected String name;
    protected String refsource;
    protected ArrayList<String> tags;

    /**
     * Copies constructor
     *
     * @param url       reference url
     * @param name      name of the reference
     * @param refsource refsource attribute
     * @param tags      tags of the reference
     */
    public ReferenceObject(String url, String name, String refsource, ArrayList<String> tags) {

        this.url = url;
        this.name = name;
        this.refsource = refsource;
        this.tags = tags;
    }

    /**
     * This method's purpose is to create a reference object from given parameters and return it
     *
     * @param url
     * @param name
     * @param refsource
     * @param tags
     * @return reference object
     */
    public ReferenceObject createRefObj(String url, String name, String refsource, ArrayList<String> tags) {

        return new ReferenceObject(url, name, refsource, tags);
    }
}

