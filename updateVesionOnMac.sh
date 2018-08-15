grep -F -r -l '0.2.3' * | xargs sed -i '' 's/0.2.3/0.2.4/g'
