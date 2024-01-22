procedure 'SyncTest', {
  projectName = 'IRT-Utilities'
  resourceName = 'cdrocxagent1'
  timeLimit = '0'

  step 'TestSync', {
    command = 'echo "Sync the webhook"'
    procedureName = 'SyncTest'
    timeLimit = '0'
    timeLimitUnits = 'seconds'
  }
}
