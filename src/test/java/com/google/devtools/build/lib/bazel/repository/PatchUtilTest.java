public class PatchUtilTest {
  private FileSystem fs;
  private Scratch scratch;
  public final void initializeFileSystemAndDirectories() throws Exception {
    fs = new InMemoryFileSystem();
    scratch = new Scratch(fs, "/root");
    assertThat(PatchUtil.readFile(newFile)).containsExactlyElementsIn(newFileContent);
    assertThat(PatchUtil.readFile(newFile)).containsExactlyElementsIn(newFileContent);
    assertThat(PatchUtil.readFile(oldFile)).isEmpty();
    assertThat(PatchUtil.readFile(oldFile)).containsExactlyElementsIn(newContent);
    assertThat(PatchUtil.readFile(newFile)).containsExactly("line one");
    assertThat(PatchUtil.readFile(newFile)).containsExactlyElementsIn(newContent);
    assertThat(PatchUtil.readFile(myFile)).containsExactly("line one");
    assertThat(PatchUtil.readFile(foo)).containsExactlyElementsIn(newFoo);
    assertThat(PatchUtil.readFile(bar)).containsExactlyElementsIn(newBar);
    assertThat(PatchUtil.readFile(fooCpp)).containsExactlyElementsIn(newFoo);
    assertThat(PatchUtil.readFile(barCpp)).containsExactlyElementsIn(newBar);
    assertThat(PatchUtil.readFile(foo)).containsExactlyElementsIn(newFoo);
    assertThat(PatchUtil.readFile(foo)).containsExactlyElementsIn(newFoo);