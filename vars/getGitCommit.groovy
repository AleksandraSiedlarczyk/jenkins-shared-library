def getGitCommit(String gitPath) {
  return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}