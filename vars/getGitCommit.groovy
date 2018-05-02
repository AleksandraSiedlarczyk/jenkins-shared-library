def call(String gitPath) {
  echo "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}