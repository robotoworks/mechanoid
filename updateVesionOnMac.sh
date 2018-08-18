grep -F -r -l '0.2.old' * | xargs sed -i '' 's/0.2.old/0.2.new/g'
