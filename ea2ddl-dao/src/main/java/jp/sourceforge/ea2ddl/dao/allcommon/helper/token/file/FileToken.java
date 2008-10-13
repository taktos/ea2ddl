package jp.sourceforge.ea2ddl.dao.allcommon.helper.token.file;

/**
 * File-Token.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface FileToken {

    /**
     * Tokenize token-file data of a specified file.
     * 
     * @param filename Input target file name. (NotNull)
     * @param fileTokenizingCallback File-tokenizing callback. (NotNull)
     * @param fileTokenizingOption File-tokenizing option. (NotNull and Required{encoding and delimiter})
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public void tokenize(String filename, FileTokenizingCallback fileTokenizingCallback, FileTokenizingOption fileTokenizingOption) throws java.io.FileNotFoundException, java.io.IOException;

    /**
     * Tokenize token-file data of a specified file.
     * <pre>
     * This method uses java.io.InputStreamReader and java.io.BufferedReader that wrap the argument[inputStream].
     * These objects are closed. (Invoking close() at finally)
     * </pre>
     * @param inputStream Input target stream. (NotNull)
     * @param fileTokenizingCallback File-tokenizing callback. (NotNull)
     * @param fileTokenizingOption File-tokenizing option. (NotNull and Required{encoding and delimiter})
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public void tokenize(java.io.InputStream inputStream, FileTokenizingCallback fileTokenizingCallback, FileTokenizingOption fileTokenizingOption) throws java.io.FileNotFoundException, java.io.IOException;

    /**
     * Make token-file from specified row resources.
     * 
     * @param filename Output target file name. (NotNull)
     * @param fileMakingCallback File-making callback. (NotNull)
     * @param fileMakingOption File-making option. (NotNull and Required{encoding and delimiter})
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public void make(String filename, FileMakingCallback fileMakingCallback, FileMakingOption fileMakingOption) throws java.io.FileNotFoundException, java.io.IOException;

    /**
     * Make token-file from specified row resources.
     * <pre>
     * This method uses java.io.BufferedOutputStream and java.io.OutputStreamWriter that wrap the argument[outputStream].
     * These objects are closed. (Invoking close() at finally)
     * </pre>
     * @param outputStream Output target stream. (NotNull)
     * @param fileMakingCallback File-making callback. (NotNull)
     * @param fileMakingOption File-making option. (NotNull and Required{encoding and delimiter})
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public void make(java.io.OutputStream outputStream, FileMakingCallback fileMakingCallback, FileMakingOption fileMakingOption) throws java.io.FileNotFoundException, java.io.IOException;
}