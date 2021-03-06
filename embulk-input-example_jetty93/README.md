# Example input plugin for Embulk with embulk-base-restclient

## Build

```
$ ./gradlew gem  # -t to watch change of files and rebuild continuously
```

## Example Configuration

```yaml
exec:
  min_output_tasks: 1
in:
  type: example_jetty93
out:
  type: file
  path_prefix: /tmp/test.outout
  file_ext: csv
  formatter:
    type: csv
    charset: UTF-8
    delimiter: ','
    newline: CRLF
    quote: '"'
    escape: '\'
```

## Example Run

```
embulk-input-example$ cd src/test/resources
embulk-input-example$ python -m SimpleHTTPServer 8080
```

```
embulk$ env RUBYLIB=./lib java -cp ".:embulk-cli/build/libs/embulk-cli-0.8.15-all.jar" org.embulk.cli.Main run -I ../embulk-input-example_jetty93/lib example.yml
```
