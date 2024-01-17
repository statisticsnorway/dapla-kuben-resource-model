# dapla-kuben-resource-model

jsonschemas which defines how resources used in kuben are defined. Useful for validation and code generation.

## Contributing

This repository uses [pre-commit](https://pre-commit.com/) to ensure that all schemas are formatted correctly before
committed.
Install the pre-commit hooks by running `pre-commit install && pre-commit install-hooks`.
The pre-commit hooks will also run as a github workflow for each push

Code under generated is generated from the JSON schemas under src. Files here should not be modified manually (only
exception is pom.xml).

Usual workflow is:
1. Create branch
2. Make changes to your schema
3. Run `pre-commit run --all-files` to format your schema
4. Commit and push your changes
5. Github action will run and generate code from your schema
6. Create a PR and merge it when it is ready

Create release:
1. Pull latest changes from main
2. Create a branch with name `release-java`
3. Push the branch
4. …
5. Profit