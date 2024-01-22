procedure 'SyncTest', {
  projectName = 'IRT-Utilities'
  resourceName = 'cdrocxagent1'
  timeLimit = '0'

  step 'TestSync', {
    command = 'echo "Hello World 1234"'
    procedureName = 'SyncTest'
    timeLimit = '0'
    timeLimitUnits = 'seconds'
  }
}
