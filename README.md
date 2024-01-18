# dapla-kuben-resource-model

Data Model for Dapla Kuben resources

## Purpose

This package contains models defining the fields and data types used in Statistics Norway's Dapla Kuben system. The
purpose
of these models is to:

- Enable validation of user data
- Enable serialization and deserialization
- Support versioning of the format
- Enforce consistency across multiple tools

## Model definition

The models are defined as [JSON Schema](https://json-schema.org/) documents. The models reside within the `src/`
directory in this repo. They may be directly used to validate metadata documents.

## Code generation

We generate code in order to facilitate production of compatible documents. All languages use the models defined in
the `src/` directory as their source. The generated code lives in the `generated/` directory, with a subdirectory for
each language, and the package within a further subdirectory.

Currently supported languages are:

- Java

## Versioning

### Overall strategy

All versions in this repo follow semantic versioning, with a twist. The packages in this repo are at major version.
That is, the package name if `v1`, `v2` etc. and thus we can support multiple versions in parallel as we avoid
conflicts (e.g. `v1` and `v2` can both have a class `Foo`).

### JSON Schema versions

_All_ changes to JSON Schema documents must result in version increments.

#### Patch versions

The most minor changes, such as corrections to descriptions of fields should result in patch version increments e.g.
0.0.1 -> 0.0.2. This changes does not require a new package version.

#### Major versions

Due to the strict nature of these models, it is very easy to introduce breaking changes. All breaking changes should
result in major version increments e.g. 1.1.14 -> 2.0.0. Examples of changes which are breaking:

- Removing a field
- Adding a required field
- Changing the name of a field
- Changing the type of a field (unless it makes the type more _permissive_)

### Code package versions

The code package versions should be incremented _at least_ as much as JSON Schema increments. For example, a minor
version increment in a JSON Schema means all code packages should be incremented by a minor version. The only exception
to this is if there are other technical changes which can be breaking, then the major version should be incremented.

More detail is provided in the README for each package.

## Release process

Each language has its own release process, refer to the READMEs with the 'generated/' directory.

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
    1. If you want to trigger a version bump you can add labels to the PR (major, minor, patch). Patch version is
       default.

Create release:

1. Pull latest changes from main
2. Create a branch with name `release-java-<something>`
3. Push the branch
4. …
5. Profit