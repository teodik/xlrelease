xlr {
  release("Sample release with a Create release task") {
    tags 'important', 'test'
    description "Sample template created from Groovy DSL"
    variables {
      stringVariable('createdReleaseIdVar')
    }
    phases {
    ['dev', 'qa', 'prd'].each {
        phase(it) {
          tasks {
            manual("Manual task") {
              description "Manual task description"
            }
          }
        }
      }
    }
  }
}